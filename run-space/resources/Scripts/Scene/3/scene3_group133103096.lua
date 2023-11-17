-- 基础信息
local base_info = {
	group_id = 133103096
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
	{ config_id = 310, gadget_id = 70310006, pos = { x = 709.225, y = 184.452, z = 1087.613 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 24, area_id = 6 },
	{ config_id = 311, gadget_id = 70220013, pos = { x = 712.598, y = 184.571, z = 1086.615 }, rot = { x = 0.000, y = 32.351, z = 0.000 }, level = 24, area_id = 6 },
	{ config_id = 313, gadget_id = 70220014, pos = { x = 710.436, y = 185.677, z = 1081.763 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 24, area_id = 6 }
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
		gadgets = { 310, 311, 313 },
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