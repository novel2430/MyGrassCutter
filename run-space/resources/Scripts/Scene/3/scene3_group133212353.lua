-- 基础信息
local base_info = {
	group_id = 133212353
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
	{ config_id = 353001, gadget_id = 70330064, pos = { x = -4171.572, y = 222.613, z = -2266.491 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1, interact_id = 35, area_id = 13 },
	{ config_id = 353002, gadget_id = 70900380, pos = { x = -4163.656, y = 226.618, z = -2258.294 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1, area_id = 13 },
	{ config_id = 353003, gadget_id = 70900380, pos = { x = -4151.369, y = 230.011, z = -2244.237 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1, area_id = 13 },
	{ config_id = 353004, gadget_id = 70900380, pos = { x = -4139.030, y = 233.368, z = -2231.313 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1, area_id = 13 },
	{ config_id = 353005, gadget_id = 70900380, pos = { x = -4125.436, y = 237.392, z = -2217.414 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1, area_id = 13 },
	{ config_id = 353006, gadget_id = 70900380, pos = { x = -4109.346, y = 240.583, z = -2200.751 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1, area_id = 13 }
}

-- 区域
regions = {
}

-- 触发器
triggers = {
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
		gadgets = { 353001, 353002, 353003, 353004, 353005, 353006 },
		regions = { },
		triggers = { },
		rand_weight = 100
	}
}

--================================================================
-- 
-- 触发器
-- 
--================================================================

require "V2_0/ElectricCore"