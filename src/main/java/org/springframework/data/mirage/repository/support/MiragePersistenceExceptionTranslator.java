/*
 * Copyright 2011 Daisuke Miyamoto.
 * Created on 2012/12/09
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.springframework.data.mirage.repository.support;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.support.PersistenceExceptionTranslator;

/**
 * TODO for daisuke
 * 
 * @since 1.0
 * @version $Id$
 * @author daisuke
 */
public class MiragePersistenceExceptionTranslator implements PersistenceExceptionTranslator {
	
	@SuppressWarnings("serial")
	@Override
	public DataAccessException translateExceptionIfPossible(RuntimeException ex) {
		if (ex.getClass().getPackage().getName().startsWith("jp.sf.amateras.mirage.exception")) {
			// TODO
			return new DataAccessException("", ex) {
			};
		}
		return null;
	}
}
