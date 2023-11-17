-- 基础信息
local base_info = {
	group_id = 250053001
}

--================================================================
-- 
-- 配置
-- 
--================================================================

-- 怪物
monsters = {
	{ config_id = 1003, monster_id = 29050101, pos = { x = -0.008, y = 0.035, z = -6.000 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1, title_id = 121, special_name_id = 7 }
}

-- NPC
npcs = {
}

-- 装置
gadgets = {
	{ config_id = 1001, gadget_id = 70350096, pos = { x = 0.000, y = 0.000, z = 3.500 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 }
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
		monsters = { 1003 },
		gadgets = { 1001 },
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