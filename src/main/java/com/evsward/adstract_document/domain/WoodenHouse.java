package com.evsward.adstract_document.domain;

import java.util.Map;

import com.evsward.adstract_document.AbstractDocument;
/*
 * define what you need，if you need, implements it.
 */
public class WoodenHouse extends AbstractDocument implements HasWoods, HasModel, HasParts {

	public WoodenHouse(Map<String, Object> properties) {
		super(properties);
	}

}
