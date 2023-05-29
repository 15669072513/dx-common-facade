package com.dx.facade.common;

import lombok.Data;

import java.util.List;

/**
 * @author fitz
 */
@Data
public class ListResp<T, S> {
	
	private List<T> record;
	private S summary;
	
	public ListResp(List<T> record) {
		this.record = record;
	}
	
	public ListResp(List<T> record, S summary) {
		this.record = record;
		this.summary = summary;
	}
}
