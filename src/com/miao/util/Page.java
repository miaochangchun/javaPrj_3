package com.miao.util;

public class Page {
	private int everyPage;			//每页显示记录数
	private int totalCount;			//总记录数
	private int totalPage;			//总页数
	private int currentPage;		//当前页
	private int beginIndex;			//查询起始点
	private boolean hasPrePage;		//是否有上一页
	private boolean hasNextPage;	//是否有下一页
	
	/**
	 * 自定义构造方法
	 * @param everyPage		每页显示记录数
	 * @param totalCount	总记录数
	 * @param totalPage		总页数
	 * @param currentPage	当前页
	 * @param beginIndex	查询起始页
	 * @param hasPrePage	是否有上一页
	 * @param hasNextPage	是否有下一页
	 */
	public Page(int everyPage, int totalCount, int totalPage, 
			int currentPage,int beginIndex, boolean hasPrePage,
			boolean hasNextPage) {	
		this.everyPage = everyPage;
		this.totalCount = totalCount;
		this.totalPage = totalPage;
		this.currentPage = currentPage;
		this.beginIndex = beginIndex;
		this.hasPrePage = hasPrePage;
		this.hasNextPage = hasNextPage;
	}
	
	/**
	 * 默认构造函数
	 */
	public Page(){
		
	}
	
	/**
	 * 获得每页显示记录数
	 * @return
	 */
	public int getEveryPage() {		
		return everyPage;
	}
	
	/**
	 * 设置每页显示记录数
	 * @param everyPage
	 */
	public void setEveryPage(int everyPage) {
		this.everyPage = everyPage;
	}
	
	/**
	 * 获得总记录数
	 * @return
	 */
	public int getTotalCount() {
		return totalCount;
	}
	
	/**
	 * 设置总记录数
	 * @param totalCount
	 */
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	/**
	 * 获得总页数
	 * @return
	 */
	public int getTotalPage() {
		return totalPage;
	}
	
	/**
	 * 设置总页数
	 * @param totalPage
	 */
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
	/**
	 * 获得当前页
	 * @return
	 */
	public int getCurrentPage() {
		return currentPage;
	}
	
	/**
	 * 设置当前页
	 * @param currentPage
	 */
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	/**
	 * 获得查询起始点
	 * @return
	 */
	public int getBeginIndex() {
		return beginIndex;
	}
	
	/**
	 * 设置查询起始点
	 * @param beginIndex
	 */
	public void setBeginIndex(int beginIndex) {
		this.beginIndex = beginIndex;
	}
	
	/**
	 * 获得是否有上一页
	 * @return
	 */
	public boolean isHasPrePage() {
		return hasPrePage;
	}
	
	/**
	 * 设置是否有上一页
	 * @param hasPrePage
	 */
	public void setHasPrePage(boolean hasPrePage) {
		this.hasPrePage = hasPrePage;
	}
	
	/**
	 * 获得是否有下一页
	 * @return
	 */
	public boolean isHasNextPage() {
		return hasNextPage;
	}
	
	/**
	 * 设置是否有下一页
	 * @param hasNextPage
	 */
	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
}
