/**
 * 2015-2016 龙果学院 (www.roncoo.com)
 */
package com.gbai.entity;

import com.baomidou.mybatisplus.annotations.TableName;

/**
 * 实体类
 *
 */
@TableName("book")
public class Book {
	private Integer bId;
	private String bName;

	public Book() {
	}

	public Book(Integer bId, String bName) {
		this.bId = bId;
		this.bName = bName;
	}

	public Integer getbId() {
		return bId;
	}

	public void setbId(Integer bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	@Override
	public String toString() {
		return "Book{" +
				"bId=" + bId +
				", bName='" + bName + '\'' +
				'}';
	}
}
