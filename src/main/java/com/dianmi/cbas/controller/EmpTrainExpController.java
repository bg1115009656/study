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
 *   @description : EmpTrainExp 控制器
 *   ---------------------------------
 *      @author codeGenerate
 *   @since 2018-12-04
 */
@RestController
@RequestMapping("/empTrainExp")
public class EmpTrainExpController extends AbstractController {
    private final Logger logger = LoggerFactory.getLogger(EmpTrainExpController.class);

    @Autowired
    public EmpTrainExpService empTrainExpService;

    /**
     * @description : 获取分页列表
     * ---------------------------------
     * @author : codeGenerate
     * @since : Create in 2018-12-04
     */
    @RequestMapping(value = "/getEmpTrainExpList",method = RequestMethod.POST)
    public Object getEmpTrainExpList(EmpTrainExp param , @RequestParam(value = "draw",defaultValue = "0") Integer draw,
    @RequestParam(value = "length") Integer length,
    @RequestParam(value = "start") Integer start) {
            DatatablesJSON<EmpTrainExp> resJson=new DatatablesJSON<>();
            try {
                Integer pageNo=getPageNo(start,length);
                Page<EmpTrainExp> page=new Page<>(pageNo,length);
                empTrainExpService.selectPage(page,new EntityWrapper<>(param));
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
     * @description : 通过id获取EmpTrainExp
     * ---------------------------------
     * @author : codeGenerate
     * @since : Create in 2018-12-04
     */
    @RequestMapping(value = "/getEmpTrainExpById",method = RequestMethod.GET)
    public Object getEmpTrainExpById(String id) {
            JSONResult<EmpTrainExp> resJson = new JSONResult<>();
            try {
            EmpTrainExp param= empTrainExpService.selectById(id);
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
     * @description : 通过id删除EmpTrainExp
     * ---------------------------------
     * @author : codeGenerate
     * @since : Create in 2018-12-04
     */
    @RequestMapping(value = "/deleteEmpTrainExpById",method = RequestMethod.GET)
    public Object deleteEmpTrainExpById(String id) {
            JSONResult<EmpTrainExp> resJson = new JSONResult<>();
            try{
                resJson.setSuccess(empTrainExpService.deleteById(id));
            }catch (Exception e) {
                    resJson.setSuccess(false);
                    resJson.setMessage("异常信息:{"+e.getClass().getName()+"}");
                    logger.info("异常信息:{}"+e.getMessage());
                }
                return resJson;
            }

    /**
     * @description : 通过id更新EmpTrainExp
     * ---------------------------------
     * @author : codeGenerate
     * @since : Create in 2018-12-04
     */
    @RequestMapping(value = "/updateEmpTrainExpById",method = RequestMethod.POST)
    public Object updateEmpTrainExpById(EmpTrainExp param) {
            JSONResult<EmpTrainExp> resJson = new JSONResult<>();
            try{
                resJson.setSuccess(empTrainExpService.updateById(param));
            }catch (Exception e) {
                    resJson.setSuccess(false);
                    resJson.setMessage("异常信息:{"+e.getClass().getName()+"}");
                    logger.info("异常信息:{}"+e.getMessage());
                }
                return resJson;
            }

    /**
     * @description : 添加EmpTrainExp
     * ---------------------------------
     * @author : codeGenerate
     * @since : Create in 2018-12-04
     */
    @RequestMapping(value = "/addEmpTrainExp",method = RequestMethod.POST)
    public Object addEmpTrainExp(EmpTrainExp param) {
            JSONResult<EmpTrainExp> resJson = new JSONResult<>();
            try{
                resJson.setSuccess(empTrainExpService.insert(param));
            }catch (Exception e) {
                resJson.setSuccess(false);
                resJson.setMessage("异常信息:{"+e.getClass().getName()+"}");
                logger.info("异常信息:{}"+e.getMessage());
            }
                return resJson;
            }
    }