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
 *   @description : EmpAuxiliary 控制器
 *   ---------------------------------
 *      @author codeGenerate
 *   @since 2018-12-04
 */
@RestController
@RequestMapping("/empAuxiliary")
public class EmpAuxiliaryController extends AbstractController {
    private final Logger logger = LoggerFactory.getLogger(EmpAuxiliaryController.class);

    @Autowired
    public EmpAuxiliaryService empAuxiliaryService;

    /**
     * @description : 获取分页列表
     * ---------------------------------
     * @author : codeGenerate
     * @since : Create in 2018-12-04
     */
    @RequestMapping(value = "/getEmpAuxiliaryList",method = RequestMethod.POST)
    public Object getEmpAuxiliaryList(EmpAuxiliary param , @RequestParam(value = "draw",defaultValue = "0") Integer draw,
    @RequestParam(value = "length") Integer length,
    @RequestParam(value = "start") Integer start) {
            DatatablesJSON<EmpAuxiliary> resJson=new DatatablesJSON<>();
            try {
                Integer pageNo=getPageNo(start,length);
                Page<EmpAuxiliary> page=new Page<>(pageNo,length);
                empAuxiliaryService.selectPage(page,new EntityWrapper<>(param));
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
     * @description : 通过id获取EmpAuxiliary
     * ---------------------------------
     * @author : codeGenerate
     * @since : Create in 2018-12-04
     */
    @RequestMapping(value = "/getEmpAuxiliaryById",method = RequestMethod.GET)
    public Object getEmpAuxiliaryById(String id) {
            JSONResult<EmpAuxiliary> resJson = new JSONResult<>();
            try {
            EmpAuxiliary param= empAuxiliaryService.selectById(id);
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
     * @description : 通过id删除EmpAuxiliary
     * ---------------------------------
     * @author : codeGenerate
     * @since : Create in 2018-12-04
     */
    @RequestMapping(value = "/deleteEmpAuxiliaryById",method = RequestMethod.GET)
    public Object deleteEmpAuxiliaryById(String id) {
            JSONResult<EmpAuxiliary> resJson = new JSONResult<>();
            try{
                resJson.setSuccess(empAuxiliaryService.deleteById(id));
            }catch (Exception e) {
                    resJson.setSuccess(false);
                    resJson.setMessage("异常信息:{"+e.getClass().getName()+"}");
                    logger.info("异常信息:{}"+e.getMessage());
                }
                return resJson;
            }

    /**
     * @description : 通过id更新EmpAuxiliary
     * ---------------------------------
     * @author : codeGenerate
     * @since : Create in 2018-12-04
     */
    @RequestMapping(value = "/updateEmpAuxiliaryById",method = RequestMethod.POST)
    public Object updateEmpAuxiliaryById(EmpAuxiliary param) {
            JSONResult<EmpAuxiliary> resJson = new JSONResult<>();
            try{
                resJson.setSuccess(empAuxiliaryService.updateById(param));
            }catch (Exception e) {
                    resJson.setSuccess(false);
                    resJson.setMessage("异常信息:{"+e.getClass().getName()+"}");
                    logger.info("异常信息:{}"+e.getMessage());
                }
                return resJson;
            }

    /**
     * @description : 添加EmpAuxiliary
     * ---------------------------------
     * @author : codeGenerate
     * @since : Create in 2018-12-04
     */
    @RequestMapping(value = "/addEmpAuxiliary",method = RequestMethod.POST)
    public Object addEmpAuxiliary(EmpAuxiliary param) {
            JSONResult<EmpAuxiliary> resJson = new JSONResult<>();
            try{
                resJson.setSuccess(empAuxiliaryService.insert(param));
            }catch (Exception e) {
                resJson.setSuccess(false);
                resJson.setMessage("异常信息:{"+e.getClass().getName()+"}");
                logger.info("异常信息:{}"+e.getMessage());
            }
                return resJson;
            }
    }