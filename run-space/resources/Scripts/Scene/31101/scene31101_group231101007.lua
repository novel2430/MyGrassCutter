-- 基础信息
local base_info = {
	group_id = 231101007
}

--================================================================
-- 
-- 配置
-- 
--================================================================

-- 怪物
monsters = {
}

-- NPC
npcs = {
}

-- 装置
gadgets = {
	{ config_id = 7001, gadget_id = 70360010, pos = { x = 0.090, y = 0.092, z = -0.084 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 }
}

-- 区域
regions = {
}

-- 触发器
triggers = {
	{ config_id = 1007002, name = "GADGET_CREATE_7002", event = EventType.EVENT_GADGET_CREATE, source = "", condition = "condition_EVENT_GADGET_CREATE_7002", action = "action_EVENT_GADGET_CREATE_7002" },
	{ config_id = 1007003, name = "SELECT_OPTION_7003", event = EventType.EVENT_SELECT_OPTION, source = "", condition = "condition_EVENT_SELECT_OPTION_7003", action = "action_EVENT_SELECT_OPTION_7003", trigger_count = 0 },
	{ config_id = 1007004, name = "SELECT_OPTION_7004", event = EventType.EVENT_SELECT_OPTION, source = "", condition = "condition_EVENT_SELECT_OPTION_7004", action = "action_EVENT_SELECT_OPTION_7004", trigger_count = 0 }
}

-- 变量
variables = {
}

--================================================================
-- 
-- 初始化配置
-- 
--================================================================

-- 初始化时创建
init_config = {
	suite = 1,
	end_suite = 0,
	rand_suite = false
}

--================================================================
-- 
-- 小组配置
-- 
--================================================================

suites = {
	{
		-- suite_id = 1,
		-- description = ,
		monsters = { },
		gadgets = { 7001 },
		regions = { },
		triggers = { "GADGET_CREATE_7002", "SELECT_OPTION_7003", "SELECT_OPTION_7004" },
		rand_weight = 100
	}
}

--================================================================
-- 
-- 触发器
-- 
--================================================================

-- 触发条件
function condition_EVENT_GADGET_CREATE_7002(context, evt)
	if 7001 ~= evt.param1 then
		return false
	end
	
	return true
end

-- 触发操作
function action_EVENT_GADGET_CREATE_7002(context, evt)
	-- 设置操作台选项
	if 0 ~= ScriptLib.SetWorktopOptionsByGroupId(context, 231101007, 7001, {175}) then
	  ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_wok_options_by_configid")
		return -1
	end
	
	return 0
end

-- 触发条件
function condition_EVENT_SELECT_OPTION_7003(context, evt)
	-- 判断是gadgetid 7001 option_id 175
	if 7001 ~= evt.param1 then
		return false	
	end
	
	if 175 ~= evt.param2 then
		return false
	end
	
	
	-- 判断变量"stage"为0
	if ScriptLib.GetGroupVariableValueByGroup(context, "stage", 231101004) ~= 0 then
			return false
	end
	
	return true
end

-- 触发操作
function action_EVENT_SELECT_OPTION_7003(context, evt)
	-- 爬塔是否允许使用技能（ is_allow_use_skill=0或1,表示不允许或允许使用主动技能）
	if 0 ~= ScriptLib.SetIsAllowUseSkill(context, 1) then
		ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : tower_allow_use_skill")
		return -1
	end
	
	-- 创建编号为1（该怪物潮的识别id)的怪物潮，创建怪物总数为11，场上怪物最少3只，最多3只
	if 0 ~= ScriptLib.AutoMonsterTide(context, 1, 231101008, {8001,8002,8005}, 11, 3, 3) then
		return -1
	end
	
	-- 创建编号为2（该怪物潮的识别id)的怪物潮，创建怪物总数为11，场上怪物最少3只，最多3只
	if 0 ~= ScriptLib.AutoMonsterTide(context, 2, 231101008, {8003,8004,8006}, 11, 3, 3) then
		return -1
	end
	
	-- 删除指定group： 231101007 ；指定config：7001；物件身上指定option：175；
	if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 231101007, 7001, 175) then
	  ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
		return -1
	end
	
	-- 改变指定group组231101007中， configid为7001的gadget的state
	if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 231101007, 7001, GadgetState.GearStop) then
	      ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
			return -1
		end 
	
	-- 改变指定group组231101004中， configid为4002的gadget的state
	if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 231101004, 4002, GadgetState.Default) then
	      ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
			return -1
		end 
	
	-- 改变指定group组231101004中， configid为4001的gadget的state
	if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 231101004, 4001, GadgetState.Default) then
	      ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
			return -1
		end 
	
	-- 改变指定group组231101010中， configid为10001的gadget的state
	if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 231101010, 10001, GadgetState.GearStart) then
	      ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
			return -1
		end 
	
	-- 改变指定group组231101010中， configid为10002的gadget的state
	if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 231101010, 10002, GadgetState.GearStart) then
	      ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
			return -1
		end 
	
	return 0
end

-- 触发条件
function condition_EVENT_SELECT_OPTION_7004(context, evt)
	-- 判断是gadgetid 7001 option_id 176
	if 7001 ~= evt.param1 then
		return false	
	end
	
	if 176 ~= evt.param2 then
		return false
	end
	
	
	-- 判断变量"stage"为1
	if ScriptLib.GetGroupVariableValueByGroup(context, "stage", 231101004) ~= 1 then
			return false
	end
	
	return true
end

-- 触发操作
function action_EVENT_SELECT_OPTION_7004(context, evt)
	-- 爬塔是否允许使用技能（ is_allow_use_skill=0或1,表示不允许或允许使用主动技能）
	if 0 ~= ScriptLib.SetIsAllowUseSkill(context, 1) then
		ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : tower_allow_use_skill")
		return -1
	end
	
		-- 重新生成指定group，指定suite
		if 0 ~= ScriptLib.RefreshGroup(context, { group_id = 231101009, suite = 2 }) then
	    ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : refresh_group_to_suite")
			return -1
		end
	
	-- 删除指定group： 231101007 ；指定config：7001；物件身上指定option：176；
	if 0 ~= ScriptLib.DelWorktopOptionByGroupId(context, 231101007, 7001, 176) then
	  ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : del_work_options_by_group_configId")
		return -1
	end
	
	-- 改变指定group组231101007中， configid为7001的gadget的state
	if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 231101007, 7001, GadgetState.GearStop) then
	      ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
			return -1
		end 
	
	-- 改变指定group组231101004中， configid为4002的gadget的state
	if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 231101004, 4002, GadgetState.Default) then
	      ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
			return -1
		end 
	
	-- 改变指定group组231101004中， configid为4001的gadget的state
	if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 231101004, 4001, GadgetState.Default) then
	      ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
			return -1
		end 
	
	-- 改变指定group组231101010中， configid为10001的gadget的state
	if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 231101010, 10001, GadgetState.GearStart) then
	      ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
			return -1
		end 
	
	-- 改变指定group组231101010中， configid为10001的gadget的state
	if 0 ~= ScriptLib.SetGroupGadgetStateByConfigId(context, 231101010, 10001, GadgetState.GearStart) then
	      ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_GroupId_ConfigId")
			return -1
		end 
	
	return 0
end