package com.dianmi.cbas.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.gbai.common.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *code is far away from bug with the animal protecting
 *  ┏┓　　　┏┓
 *┏┛┻━━━┛┻┓
 *┃　　　　　　　┃ 　
 *┃　　　━　　　┃
 *┃　┳┛　┗┳　┃
 *┃　　　　　　　┃
 *┃　　　┻　　　┃
 *┃　　　　　　　┃
 *┗━┓　　　┏━┛
 *　　┃　　　┃神兽保佑
 *　　┃　　　┃代码无BUG！
 *　　┃　　　┗━━━┓
 *　　┃　　　　　　　┣┓
 *　　┃　　　　　　　┏┛
 *　　┗┓┓┏━┳┓┏┛
 *　　　┃┫┫　┃┫┫
 *　　　┗┻┛　┗┻┛
 *
 *   @description : EmpContact 控制器
 *   ---------------------------------
 *      @author codeGenerate
 *   @since 2018-12-04
 */
@RestController
@RequestMapping("/empContact")
public class EmpContactController extends AbstractController {
    private final Logger logger = LoggerFactory.getLogger(EmpContactController.class);

    @Autowired
    public EmpContactService empContactService;

    /**
     * @description : 获取分页列表
     * ---------------------------------
     * @author : codeGenerate
     * @since : Create in 2018-12-04
     */
    @RequestMapping(value = "/getEmpContactList",method = RequestMethod.POST)
    public Object getEmpContactList(EmpContact param , @RequestParam(value = "draw",defaultValue = "0") Integer draw,
    @RequestParam(value = "length") Integer length,
    @RequestParam(value = "start") Integer start) {
            DatatablesJSON<EmpContact> resJson=new DatatablesJSON<>();
            try {
                Integer pageNo=getPageNo(start,length);
                Page<EmpContact> page=new Page<>(pageNo,length);
                empContactService.selectPage(page,new EntityWrapper<>(param));
                resJson.setDraw(draw++);
                resJson.setRecordsTotal(page.getTotal());
                resJson.setRecordsFiltered(page.getTotal());
                resJson.setData(page.getRecords());
                resJson.setSuccess(true);
            }catch (Exception e){
                    resJson.setSuccess(false);
                    resJson.setError("异常信息:{"+e.getClass().getName()+"}");
                    logger.info("异常信息:{}"+e.getMessage());
                }
            return resJson;
            }

    /**
     * @description : 通过id获取EmpContact
     * ---------------------------------
     * @author : codeGenerate
     * @since : Create in 2018-12-04
     */
    @RequestMapping(value = "/getEmpContactById",method = RequestMethod.GET)
    public Object getEmpContactById(String id) {
            JSONResult<EmpContact> resJson = new JSONResult<>();
            try {
            EmpContact param= empContactService.selectById(id);
                resJson.setData(param);
                resJson.setSuccess(true);
            }catch (Exception e) {
                    resJson.setSuccess(false);
                    resJson.setMessage("异常信息:{"+e.getClass().getName()+"}");
                    logger.info("异常信息:{}"+e.getMessage());
                }
                return resJson;
            }

    /**
     * @description : 通过id删除EmpContact
     * ---------------------------------
     * @author : codeGenerate
     * @since : Create in 2018-12-04
     */
    @RequestMapping(value = "/deleteEmpContactById",method = RequestMethod.GET)
    public Object deleteEmpContactById(String id) {
            JSONResult<EmpContact> resJson = new JSONResult<>();
            try{
                resJson.setSuccess(empContactService.deleteById(id));
            }catch (Exception e) {
                    resJson.setSuccess(false);
                    resJson.setMessage("异常信息:{"+e.getClass().getName()+"}");
                    logger.info("异常信息:{}"+e.getMessage());
                }
                return resJson;
            }

    /**
     * @description : 通过id更新EmpContact
     * ---------------------------------
     * @author : codeGenerate
     * @since : Create in 2018-12-04
     */
    @RequestMapping(value = "/updateEmpContactById",method = RequestMethod.POST)
    public Object updateEmpContactById(EmpContact param) {
            JSONResult<EmpContact> resJson = new JSONResult<>();
            try{
                resJson.setSuccess(empContactService.updateById(param));
            }catch (Exception e) {
                    resJson.setSuccess(false);
                    resJson.setMessage("异常信息:{"+e.getClass().getName()+"}");
                    logger.info("异常信息:{}"+e.getMessage());
                }
                return resJson;
            }

    /**
     * @description : 添加EmpContact
     * ---------------------------------
     * @author : codeGenerate
     * @since : Create in 2018-12-04
     */
    @RequestMapping(value = "/addEmpContact",method = RequestMethod.POST)
    public Object addEmpContact(EmpContact param) {
            JSONResult<EmpContact> resJson = new JSONResult<>();
            try{
                resJson.setSuccess(empContactService.insert(param));
            }catch (Exception e) {
                resJson.setSuccess(false);
                resJson.setMessage("异常信息:{"+e.getClass().getName()+"}");
                logger.info("异常信息:{}"+e.getMessage());
            }
                return resJson;
            }
    }