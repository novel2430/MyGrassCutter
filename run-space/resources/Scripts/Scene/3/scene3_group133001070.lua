-- 基础信息
local base_info = {
	group_id = 133001070
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
	{ config_id = 70004, gadget_id = 70290203, pos = { x = 1560.857, y = 276.747, z = -1028.752 }, rot = { x = 0.000, y = 123.837, z = 0.000 }, level = 1, persistent = true, area_id = 10 }
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
		gadgets = { 70004 },
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