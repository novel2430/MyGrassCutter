-- 基础信息
local base_info = {
	group_id = 133401025
}

--================================================================
-- 
-- 配置
-- 
--================================================================

-- 怪物
monsters = {
	{ config_id = 25001, monster_id = 20060401, pos = { x = 3057.334, y = 337.590, z = 4442.673 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 10, drop_tag = "飘浮灵", disableWander = true, pose_id = 101 },
	{ config_id = 25004, monster_id = 20060401, pos = { x = 3057.271, y = 338.095, z = 4449.380 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 10, drop_tag = "飘浮灵", disableWander = true, pose_id = 101 },
	{ config_id = 25005, monster_id = 20060401, pos = { x = 3051.661, y = 337.391, z = 4446.358 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 10, drop_tag = "飘浮灵", disableWander = true, pose_id = 101 }
}

-- NPC
npcs = {
}

-- 装置
gadgets = {
	{ config_id = 25002, gadget_id = 70211012, pos = { x = 3057.120, y = 336.326, z = 4445.954 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1, chest_drop_id = 1000100, drop_count = 1, state = GadgetState.ChestLocked, isOneoff = true, persistent = true, explore = { name = "chest", exp = 1 } }
}

-- 区域
regions = {
}

-- 触发器
triggers = {
	{ config_id = 1025003, name = "ANY_MONSTER_DIE_25003", event = EventType.EVENT_ANY_MONSTER_DIE, source = "", condition = "condition_EVENT_ANY_MONSTER_DIE_25003", action = "action_EVENT_ANY_MONSTER_DIE_25003" }
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
		monsters = { 25001, 25004, 25005 },
		gadgets = { 25002 },
		regions = { },
		triggers = { "ANY_MONSTER_DIE_25003" },
		rand_weight = 100
	}
}

--================================================================
-- 
-- 触发器
-- 
--================================================================

-- 触发条件
function condition_EVENT_ANY_MONSTER_DIE_25003(context, evt)
	-- 判断剩余怪物数量是否是0
	if ScriptLib.GetGroupMonsterCount(context) ~= 0 then
		return false
	end
	
	return true
end

-- 触发操作
function action_EVENT_ANY_MONSTER_DIE_25003(context, evt)
	-- 将configid为 25002 的物件更改为状态 GadgetState.Default
	if 0 ~= ScriptLib.SetGadgetStateByConfigId(context, 25002, GadgetState.Default) then
	  ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : set_gadget_state_by_configId")
			return -1
		end 
	
	-- 运营数据埋点，匹配LD定义的规则使用
	    if 0 ~= ScriptLib.MarkPlayerAction(context, 4000, 3, 1) then
	      ScriptLib.PrintContextLog(context, "@@ LUA_WARNING : mark_playerAction")
	      return -1
	    end
	
	return 0
end