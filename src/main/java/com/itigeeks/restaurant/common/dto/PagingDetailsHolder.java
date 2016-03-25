package com.itigeeks.restaurant.common.dto;

import java.io.Serializable;

import com.itigeeks.restaurant.common.enums.PagingDirection;

public class PagingDetailsHolder implements Serializable {

	private static final long serialVersionUID = 1L;
	private int pageSize = 10;
	private int startResult = -1*pageSize;

	public int getPageSize() {
		return pageSize;
	}

	public void setStartResult(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getStartResult() {
		return startResult;
	}

	public void setStartPage(int startPage) {
		this.startResult = startPage;
	}
 
	public void adjustStartResultToMatchDirection(int numberOfAllResults,
			PagingDirection direction) {
		if (numberOfAllResults > 0 && numberOfAllResults>pageSize) {
			if (direction != null && direction == PagingDirection.NEXT) {
				if (startResult <= pageSize*-1) {
					startResult += pageSize;

				} else {

					int numberOfResult = pageSize * startResult;

					if (numberOfResult > numberOfAllResults) {
						if (numberOfResult - numberOfAllResults <= pageSize) {
							startResult += pageSize;
						} else {
							startResult = 0;
						}

					} else {
						startResult += pageSize;

					}
				}
			} else if (direction != null&& direction == PagingDirection.PREVIOUS) {
					
				if (startResult <= 0) 
				{
					startResult =  (numberOfAllResults-pageSize)+1; ;
				}
				else {
					if (startResult >= 1) {
						startResult-=pageSize;
					} else {
						startResult = pageSize*-1;
					}
				}
			}

		}

	}
}
