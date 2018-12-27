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
 *   @description : EmpWorkExp 控制器
 *   ---------------------------------
 *      @author codeGenerate
 *   @since 2018-12-04
 */
@RestController
@RequestMapping("/empWorkExp")
public class EmpWorkExpController extends AbstractController {
    private final Logger logger = LoggerFactory.getLogger(EmpWorkExpController.class);

    @Autowired
    public EmpWorkExpService empWorkExpService;

    /**
     * @description : 获取分页列表
     * ---------------------------------
     * @author : codeGenerate
     * @since : Create in 2018-12-04
     */
    @RequestMapping(value = "/getEmpWorkExpList",method = RequestMethod.POST)
    public Object getEmpWorkExpList(EmpWorkExp param , @RequestParam(value = "draw",defaultValue = "0") Integer draw,
    @RequestParam(value = "length") Integer length,
    @RequestParam(value = "start") Integer start) {
            DatatablesJSON<EmpWorkExp> resJson=new DatatablesJSON<>();
            try {
                Integer pageNo=getPageNo(start,length);
                Page<EmpWorkExp> page=new Page<>(pageNo,length);
                empWorkExpService.selectPage(page,new EntityWrapper<>(param));
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
     * @description : 通过id获取EmpWorkExp
     * ---------------------------------
     * @author : codeGenerate
     * @since : Create in 2018-12-04
     */
    @RequestMapping(value = "/getEmpWorkExpById",method = RequestMethod.GET)
    public Object getEmpWorkExpById(String id) {
            JSONResult<EmpWorkExp> resJson = new JSONResult<>();
            try {
            EmpWorkExp param= empWorkExpService.selectById(id);
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
     * @description : 通过id删除EmpWorkExp
     * ---------------------------------
     * @author : codeGenerate
     * @since : Create in 2018-12-04
     */
    @RequestMapping(value = "/deleteEmpWorkExpById",method = RequestMethod.GET)
    public Object deleteEmpWorkExpById(String id) {
            JSONResult<EmpWorkExp> resJson = new JSONResult<>();
            try{
                resJson.setSuccess(empWorkExpService.deleteById(id));
            }catch (Exception e) {
                    resJson.setSuccess(false);
                    resJson.setMessage("异常信息:{"+e.getClass().getName()+"}");
                    logger.info("异常信息:{}"+e.getMessage());
                }
                return resJson;
            }

    /**
     * @description : 通过id更新EmpWorkExp
     * ---------------------------------
     * @author : codeGenerate
     * @since : Create in 2018-12-04
     */
    @RequestMapping(value = "/updateEmpWorkExpById",method = RequestMethod.POST)
    public Object updateEmpWorkExpById(EmpWorkExp param) {
            JSONResult<EmpWorkExp> resJson = new JSONResult<>();
            try{
                resJson.setSuccess(empWorkExpService.updateById(param));
            }catch (Exception e) {
                    resJson.setSuccess(false);
                    resJson.setMessage("异常信息:{"+e.getClass().getName()+"}");
                    logger.info("异常信息:{}"+e.getMessage());
                }
                return resJson;
            }

    /**
     * @description : 添加EmpWorkExp
     * ---------------------------------
     * @author : codeGenerate
     * @since : Create in 2018-12-04
     */
    @RequestMapping(value = "/addEmpWorkExp",method = RequestMethod.POST)
    public Object addEmpWorkExp(EmpWorkExp param) {
            JSONResult<EmpWorkExp> resJson = new JSONResult<>();
            try{
                resJson.setSuccess(empWorkExpService.insert(param));
            }catch (Exception e) {
                resJson.setSuccess(false);
                resJson.setMessage("异常信息:{"+e.getClass().getName()+"}");
                logger.info("异常信息:{}"+e.getMessage());
            }
                return resJson;
            }
    }