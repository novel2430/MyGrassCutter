-- 基础信息
local base_info = {
	group_id = 133308429
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
	{ config_id = 429001, gadget_id = 70500000, pos = { x = -2347.380, y = 91.406, z = 4551.780 }, rot = { x = 344.470, y = 3.348, z = 339.033 }, level = 32, point_type = 1001, area_id = 26 },
	{ config_id = 429002, gadget_id = 70500000, pos = { x = -2345.592, y = 91.375, z = 4553.620 }, rot = { x = 338.840, y = 309.466, z = 7.008 }, level = 32, point_type = 1001, area_id = 26 },
	{ config_id = 429003, gadget_id = 70500000, pos = { x = -2344.015, y = 91.138, z = 4555.058 }, rot = { x = 336.265, y = 300.546, z = 357.411 }, level = 32, point_type = 1002, area_id = 26 },
	{ config_id = 429004, gadget_id = 70500000, pos = { x = -2344.871, y = 91.271, z = 4554.181 }, rot = { x = 343.678, y = 331.775, z = 341.352 }, level = 32, point_type = 1002, area_id = 26 },
	{ config_id = 429005, gadget_id = 70500000, pos = { x = -2346.810, y = 91.570, z = 4552.645 }, rot = { x = 29.963, y = 119.000, z = 4.722 }, level = 32, point_type = 1001, area_id = 26 }
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
		gadgets = { 429001, 429002, 429003, 429004, 429005 },
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