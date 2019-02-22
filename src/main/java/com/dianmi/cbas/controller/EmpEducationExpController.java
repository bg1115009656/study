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
 *   @description : EmpEducationExp 控制器
 *   ---------------------------------
 *      @author codeGenerate
 *   @since 2018-12-04
 */
@RestController
@RequestMapping("/empEducationExp")
public class EmpEducationExpController extends AbstractController {
    private final Logger logger = LoggerFactory.getLogger(EmpEducationExpController.class);

    @Autowired
    public EmpEducationExpService empEducationExpService;

    /**
     * @description : 获取分页列表
     * ---------------------------------
     * @author : codeGenerate
     * @since : Create in 2018-12-04
     */
    @RequestMapping(value = "/getEmpEducationExpList",method = RequestMethod.POST)
    public Object getEmpEducationExpList(EmpEducationExp param , @RequestParam(value = "draw",defaultValue = "0") Integer draw,
    @RequestParam(value = "length") Integer length,
    @RequestParam(value = "start") Integer start) {
            DatatablesJSON<EmpEducationExp> resJson=new DatatablesJSON<>();
            try {
                Integer pageNo=getPageNo(start,length);
                Page<EmpEducationExp> page=new Page<>(pageNo,length);
                empEducationExpService.selectPage(page,new EntityWrapper<>(param));
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
     * @description : 通过id获取EmpEducationExp
     * ---------------------------------
     * @author : codeGenerate
     * @since : Create in 2018-12-04
     */
    @RequestMapping(value = "/getEmpEducationExpById",method = RequestMethod.GET)
    public Object getEmpEducationExpById(String id) {
            JSONResult<EmpEducationExp> resJson = new JSONResult<>();
            try {
            EmpEducationExp param= empEducationExpService.selectById(id);
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
     * @description : 通过id删除EmpEducationExp
     * ---------------------------------
     * @author : codeGenerate
     * @since : Create in 2018-12-04
     */
    @RequestMapping(value = "/deleteEmpEducationExpById",method = RequestMethod.GET)
    public Object deleteEmpEducationExpById(String id) {
            JSONResult<EmpEducationExp> resJson = new JSONResult<>();
            try{
                resJson.setSuccess(empEducationExpService.deleteById(id));
            }catch (Exception e) {
                    resJson.setSuccess(false);
                    resJson.setMessage("异常信息:{"+e.getClass().getName()+"}");
                    logger.info("异常信息:{}"+e.getMessage());
                }
                return resJson;
            }

    /**
     * @description : 通过id更新EmpEducationExp
     * ---------------------------------
     * @author : codeGenerate
     * @since : Create in 2018-12-04
     */
    @RequestMapping(value = "/updateEmpEducationExpById",method = RequestMethod.POST)
    public Object updateEmpEducationExpById(EmpEducationExp param) {
            JSONResult<EmpEducationExp> resJson = new JSONResult<>();
            try{
                resJson.setSuccess(empEducationExpService.updateById(param));
            }catch (Exception e) {
                    resJson.setSuccess(false);
                    resJson.setMessage("异常信息:{"+e.getClass().getName()+"}");
                    logger.info("异常信息:{}"+e.getMessage());
                }
                return resJson;
            }

    /**
     * @description : 添加EmpEducationExp
     * ---------------------------------
     * @author : codeGenerate
     * @since : Create in 2018-12-04
     */
    @RequestMapping(value = "/addEmpEducationExp",method = RequestMethod.POST)
    public Object addEmpEducationExp(EmpEducationExp param) {
            JSONResult<EmpEducationExp> resJson = new JSONResult<>();
            try{
                resJson.setSuccess(empEducationExpService.insert(param));
            }catch (Exception e) {
                resJson.setSuccess(false);
                resJson.setMessage("异常信息:{"+e.getClass().getName()+"}");
                logger.info("异常信息:{}"+e.getMessage());
            }
                return resJson;
            }
    }