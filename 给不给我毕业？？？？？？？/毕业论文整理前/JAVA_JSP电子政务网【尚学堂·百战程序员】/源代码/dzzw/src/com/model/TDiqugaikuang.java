package com.model;

/**
 * TDiqugaikuang generated by MyEclipse Persistence Tools
 */

public class TDiqugaikuang implements java.io.Serializable
{

	// Fields

	private Integer id;

	private String content;

	// Constructors

	/** default constructor */
	public TDiqugaikuang()
	{
	}

	/** full constructor */
	public TDiqugaikuang(String content)
	{
		this.content = content;
	}

	// Property accessors

	public Integer getId()
	{
		return this.id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getContent()
	{
		return this.content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

}