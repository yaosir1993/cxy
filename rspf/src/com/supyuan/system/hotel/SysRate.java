package com.supyuan.system.hotel;

import com.supyuan.component.base.BaseProjectModel;
import com.supyuan.jfinal.component.annotation.ModelBind;

@ModelBind(table = "sys_rate")
public class SysRate extends BaseProjectModel<SysRate> {
	private static final long serialVersionUID = 1L;
	public static final SysRate dao = new SysRate();
}
