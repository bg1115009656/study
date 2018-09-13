/**
 * 2015-2016 龙果学院 (www.roncoo.com)
 */
package com.gbai.modle;

/**
 * 实体类
 * 
 */
public class Book {
	private Integer id;
	private String name;

	public Book() {
	}

	public Book(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
