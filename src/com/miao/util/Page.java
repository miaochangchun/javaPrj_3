package com.miao.util;

public class Page {
	private int everyPage;			//ÿҳ��ʾ��¼��
	private int totalCount;			//�ܼ�¼��
	private int totalPage;			//��ҳ��
	private int currentPage;		//��ǰҳ
	private int beginIndex;			//��ѯ��ʼ��
	private boolean hasPrePage;		//�Ƿ�����һҳ
	private boolean hasNextPage;	//�Ƿ�����һҳ
	
	/**
	 * �Զ��幹�췽��
	 * @param everyPage		ÿҳ��ʾ��¼��
	 * @param totalCount	�ܼ�¼��
	 * @param totalPage		��ҳ��
	 * @param currentPage	��ǰҳ
	 * @param beginIndex	��ѯ��ʼҳ
	 * @param hasPrePage	�Ƿ�����һҳ
	 * @param hasNextPage	�Ƿ�����һҳ
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
	 * Ĭ�Ϲ��캯��
	 */
	public Page(){
		
	}
	
	/**
	 * ���ÿҳ��ʾ��¼��
	 * @return
	 */
	public int getEveryPage() {		
		return everyPage;
	}
	
	/**
	 * ����ÿҳ��ʾ��¼��
	 * @param everyPage
	 */
	public void setEveryPage(int everyPage) {
		this.everyPage = everyPage;
	}
	
	/**
	 * ����ܼ�¼��
	 * @return
	 */
	public int getTotalCount() {
		return totalCount;
	}
	
	/**
	 * �����ܼ�¼��
	 * @param totalCount
	 */
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	/**
	 * �����ҳ��
	 * @return
	 */
	public int getTotalPage() {
		return totalPage;
	}
	
	/**
	 * ������ҳ��
	 * @param totalPage
	 */
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
	/**
	 * ��õ�ǰҳ
	 * @return
	 */
	public int getCurrentPage() {
		return currentPage;
	}
	
	/**
	 * ���õ�ǰҳ
	 * @param currentPage
	 */
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	/**
	 * ��ò�ѯ��ʼ��
	 * @return
	 */
	public int getBeginIndex() {
		return beginIndex;
	}
	
	/**
	 * ���ò�ѯ��ʼ��
	 * @param beginIndex
	 */
	public void setBeginIndex(int beginIndex) {
		this.beginIndex = beginIndex;
	}
	
	/**
	 * ����Ƿ�����һҳ
	 * @return
	 */
	public boolean isHasPrePage() {
		return hasPrePage;
	}
	
	/**
	 * �����Ƿ�����һҳ
	 * @param hasPrePage
	 */
	public void setHasPrePage(boolean hasPrePage) {
		this.hasPrePage = hasPrePage;
	}
	
	/**
	 * ����Ƿ�����һҳ
	 * @return
	 */
	public boolean isHasNextPage() {
		return hasNextPage;
	}
	
	/**
	 * �����Ƿ�����һҳ
	 * @param hasNextPage
	 */
	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
}
