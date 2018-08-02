package com.gbai.controller;

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
 *   @description : User 控制器
 *   ---------------------------------
 *      @author codeGenerate
 *   @since 2018-08-01
 */
@RestController
@RequestMapping("/user")
public class UserController extends AbstractController {
    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    public UserService userService;

    /**
     * @description : 获取分页列表
     * ---------------------------------
     * @author : codeGenerate
     * @since : Create in 2018-08-01
     */
    @RequestMapping(value = "/getUserList",method = RequestMethod.POST)
    public Object getUserList(User param , @RequestParam(value = "draw",defaultValue = "0") Integer draw,
    @RequestParam(value = "length") Integer length,
    @RequestParam(value = "start") Integer start) {
            DatatablesJSON<User> resJson=new DatatablesJSON<>();
            try {
                Integer pageNo=getPageNo(start,length);
                Page<User> page=new Page<>(pageNo,length);
                userService.selectPage(page,new EntityWrapper<>(param));
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
     * @description : 通过id获取User
     * ---------------------------------
     * @author : codeGenerate
     * @since : Create in 2018-08-01
     */
    @RequestMapping(value = "/getUserById",method = RequestMethod.GET)
    public Object getUserById(String id) {
            JSONResult<User> resJson = new JSONResult<>();
            try {
            User param= userService.selectById(id);
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
     * @description : 通过id删除User
     * ---------------------------------
     * @author : codeGenerate
     * @since : Create in 2018-08-01
     */
    @RequestMapping(value = "/deleteUserById",method = RequestMethod.GET)
    public Object deleteUserById(String id) {
            JSONResult<User> resJson = new JSONResult<>();
            try{
                resJson.setSuccess(userService.deleteById(id));
            }catch (Exception e) {
                    resJson.setSuccess(false);
                    resJson.setMessage("异常信息:{"+e.getClass().getName()+"}");
                    logger.info("异常信息:{}"+e.getMessage());
                }
                return resJson;
            }

    /**
     * @description : 通过id更新User
     * ---------------------------------
     * @author : codeGenerate
     * @since : Create in 2018-08-01
     */
    @RequestMapping(value = "/updateUserById",method = RequestMethod.POST)
    public Object updateUserById(User param) {
            JSONResult<User> resJson = new JSONResult<>();
            try{
                resJson.setSuccess(userService.updateById(param));
            }catch (Exception e) {
                    resJson.setSuccess(false);
                    resJson.setMessage("异常信息:{"+e.getClass().getName()+"}");
                    logger.info("异常信息:{}"+e.getMessage());
                }
                return resJson;
            }

    /**
     * @description : 添加User
     * ---------------------------------
     * @author : codeGenerate
     * @since : Create in 2018-08-01
     */
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public Object addUser(User param) {
            JSONResult<User> resJson = new JSONResult<>();
            try{
                resJson.setSuccess(userService.insert(param));
            }catch (Exception e) {
                resJson.setSuccess(false);
                resJson.setMessage("异常信息:{"+e.getClass().getName()+"}");
                logger.info("异常信息:{}"+e.getMessage());
            }
                return resJson;
            }
    }