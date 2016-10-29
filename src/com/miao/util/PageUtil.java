package com.miao.util;
/**
 * ��ҳ��Ϣ������
 * @author 10048
 *
 */
public class PageUtil {
	/**
	 * ������ҳ��Ϣ����
	 * @param everyPage		ÿҳ��ʾ�ĸ���
	 * @param totalCount	��ҳ��
	 * @param currentPage	��ǰҳ
	 * @return
	 */
	public static Page createPage(int everyPage,int totalCount,int currentPage) {
		everyPage = getEveryPage(everyPage);
		currentPage = getCurrentPage(currentPage);
		int totalPage = getTotalPage(everyPage, totalCount);
		int beginIndex = getBeginIndex(everyPage, currentPage);
		boolean hasPrePage = getHasPrePage(currentPage);
		boolean hasNextPage = getHasNextPage(totalPage, currentPage);
		return new Page(everyPage, totalCount, totalPage, currentPage,
				beginIndex, hasPrePage,  hasNextPage);
	}
	
	/**
	 * ���ÿҳ��ʾ��¼��
	 * @param everyPage	ÿҳ��ʾ�ĸ���
	 * @return
	 */
	public static int getEveryPage(int everyPage) {	
		return everyPage == 0 ? 10 : everyPage;
	}
	
	/**
	 * ��õ�ǰҳ
	 * @param currentPage	��ǰҳ
	 * @return
	 */
	public static int getCurrentPage(int currentPage) {	
		return currentPage == 0 ? 1 : currentPage;
	}
	
	/**
	 * �����ҳ��
	 * @param everyPage		ÿҳ��ʾ�ĸ���
	 * @param totalCount	��ҳ��
	 * @return
	 */
	public static int getTotalPage(int everyPage,int totalCount) {
		int totalPage = 0;
		if(totalCount != 0 &&totalCount % everyPage == 0) {
			totalPage = totalCount / everyPage;
		} else {
			totalPage = totalCount / everyPage + 1;
		}
		return totalPage;
	}
	
	/**
	 * �����ʼλ��
	 * @param everyPage		ÿҳ��ʾ�ĸ���
	 * @param currentPage	��ǰҳ
	 * @return
	 */
	public static int getBeginIndex(int everyPage,int currentPage) {
		return (currentPage - 1) * everyPage;
	}
	
	/**
	 * ����Ƿ�����һҳ
	 * @param currentPage	��ǰҳ
	 * @return
	 */
	public static boolean getHasPrePage(int currentPage) {
		return currentPage == 1 ? false : true;
	}
	
	/**
	 * ����Ƿ�����һҳ
	 * @param totalPage		��ҳ��
	 * @param currentPage	��ǰҳ
	 * @return
	 */
	public static boolean getHasNextPage(int totalPage, int currentPage) {
		return currentPage == totalPage || totalPage == 0 ? false : true;
	}
}
