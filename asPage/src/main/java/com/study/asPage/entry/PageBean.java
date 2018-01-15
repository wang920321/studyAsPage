/**
 * 
 */
package com.study.asPage.entry;

import java.util.List;

/**
 * @author Administrator
 * @param <T>
 *
 */
public class PageBean<T> {
	private int currPage;//当前页数
    private int pageSize;//每页显示的记录数
    private int totalCount;//总记录数
    private int totalPage;//总页数
    private List<T> lists;//每页的显示的数据
	/**
	 * @return the currPage
	 */
	public int getCurrPage() {
		return currPage;
	}
	/**
	 * @param currPage the currPage to set
	 */
	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}
	/**
	 * @return the pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}
	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	/**
	 * @return the totalCount
	 */
	public int getTotalCount() {
		return totalCount;
	}
	/**
	 * @param totalCount the totalCount to set
	 */
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	/**
	 * @return the totalPage
	 */
	public int getTotalPage() {
		return totalPage;
	}
	/**
	 * @param totalPage the totalPage to set
	 */
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	/**
	 * @return the lists
	 */
	public List<T> getLists() {
		return lists;
	}
	/**
	 * @param lists the lists to set
	 */
	public void setLists(List<T> lists) {
		this.lists = lists;
	}
    
}
