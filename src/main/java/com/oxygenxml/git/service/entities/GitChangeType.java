package com.oxygenxml.git.service.entities;

/**
 * Used in File Status to mark the file in which of the following states it is
 * 
 * @author Beniamin Savu
 *
 */
public enum GitChangeType {
	
	/**This file is a submodule*/
	SUBMODULE,
	
	/** File is in conflict */
	CONFLICT,

	/** Add a new file to the project */
	ADD,

	/** Modify an existing file in the project (content and/or mode) */
	MODIFY,

	/** Delete an existing file from the project */
	DELETE,
}
