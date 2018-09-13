package com.gbai.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * code is far away from bug with the animal protecting
 * ┏┓　　　┏┓
 * ┏┛┻━━━┛┻┓
 * ┃　　　　　　　┃
 * ┃　　　━　　　┃
 * ┃　┳┛　┗┳　┃
 * ┃　　　　　　　┃
 * ┃　　　┻　　　┃
 * ┃　　　　　　　┃
 * ┗━┓　　　┏━┛
 * 　　┃　　　┃神兽保佑
 * 　　┃　　　┃代码无BUG！
 * 　　┃　　　┗━━━┓
 * 　　┃　　　　　　　┣┓
 * 　　┃　　　　　　　┏┛
 * 　　┗┓┓┏━┳┓┏┛
 * 　　　┃┫┫　┃┫┫
 * 　　　┗┻┛　┗┻┛
 *
 *
 * @description : 控制器基类
 * ---------------------------------
 * @Author :
 * @since :
 */
public abstract class AbstractController {
    private static Logger logger = LoggerFactory.getLogger(AbstractController.class);

    /**
     * 计算当前页数
     *
     * @param start
     *            偏移量
     * @param length
     *            页大小
     * @return pageNo 当前页数
     */
    public static Integer getPageNo(Integer start, Integer length) {
        Integer pageNo = 1;
        if (++start > 1) {
            pageNo = start / length;
            if (start % length > 0)
                pageNo++;
        }
        return pageNo;
    }
}
