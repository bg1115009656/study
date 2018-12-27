package com.dianmi.esign.controller;
import com.dianmi.esign.core.BaseController;
import com.dianmi.esign.core.Result;
import com.dianmi.esign.core.ResultGenerator;
import com.dianmi.esign.model.EntInfo;
import com.dianmi.esign.model.ReviewInfo;
import com.dianmi.esign.model.SignAccountInfo;
import com.dianmi.esign.service.EntInfoService;
import com.dianmi.esign.service.ReviewInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/06/15.
*/
@RestController
@RequestMapping("/review/info")
public class ReviewInfoController {
    private static String APPROVING = "待审核";
    private static String APPROVE_SUCCESS = "审核通过";
    private static String APPROVING_FAIL = "审核不通过";
    @Resource
    private ReviewInfoService reviewInfoService;
    @Resource
    private EntInfoService entInfoService;

    /**
     * 新增审核，默认状态待审核
     * @param reviewInfo
     * @return
     */
    @PostMapping
    public Result add(@RequestBody ReviewInfo reviewInfo) {
        reviewInfo.setReviewStatus(APPROVING);
        reviewInfoService.save(reviewInfo);
        return ResultGenerator.genSuccessResult();
    }

    /**
     * 删除为逻辑删除
     * @param reviewUUId
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable String reviewUUId) {
        ReviewInfo reviewInfo = reviewInfoService.findById(reviewUUId);
        reviewInfo.setStatus("INVALID");
        reviewInfoService.update(reviewInfo);
        return ResultGenerator.genSuccessResult();
    }

    /**
     * 更新审核状态（待审核，通过，不通过）
     * @param approvStatus
     * @param reviewUUId
     * @return
     */
    @PutMapping
    public Result update(@RequestParam String approvStatus,@RequestParam String reviewUUId) {
        ReviewInfo reviewInfo = reviewInfoService.findById(reviewUUId);
        reviewInfo.setReviewStatus(approvStatus);
        reviewInfoService.update(reviewInfo);
        return ResultGenerator.genSuccessResult();
    }

    /**
     * 此处需设置为查看员工详情，调用员工后台接口
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        ReviewInfo reviewInfo = reviewInfoService.findById(id);
        return ResultGenerator.genSuccessResult(reviewInfo);
    }

    /**
     * 根据审核状态显示员工审核列表
     * @param page
     * @param size
     * @param approvStatus
     * @return
     */
    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size,@RequestParam(defaultValue = "待审核") String approvStatus) {
        SignAccountInfo User = BaseController.getCurrentUser();
        EntInfo entInfo = entInfoService.findById(User.getBelongEntId());
        PageHelper.startPage(page, size);
        List<ReviewInfo> list = reviewInfoService.findByEntUUIDAndAppStatus(entInfo.getEntUuid(),approvStatus);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
