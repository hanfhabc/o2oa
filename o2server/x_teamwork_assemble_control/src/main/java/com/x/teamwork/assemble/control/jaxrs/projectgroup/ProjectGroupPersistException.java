package com.x.teamwork.assemble.control.jaxrs.projectgroup;

import com.x.base.core.project.exception.PromptException;

class ProjectGroupPersistException extends PromptException {

	private static final long serialVersionUID = 1859164370743532895L;

	ProjectGroupPersistException( Throwable e ) {
		super("系统在保存项目组信息时发生异常。" , e );
	}
	
	ProjectGroupPersistException( Throwable e, String message ) {
		super("系统在保存项目组信息时发生异常。Message:" + message, e );
	}
	
	ProjectGroupPersistException( String message ) {
		super("系统在保存项目组信息时发生异常。Message:" + message );
	}
}
