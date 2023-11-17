-- 基础信息
local base_info = {
	group_id = 201078001
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
	{ config_id = 1001, gadget_id = 70360089, pos = { x = 7.556, y = 1.890, z = 0.274 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1, room = 1 },
	{ config_id = 1002, gadget_id = 70360089, pos = { x = 0.397, y = 0.775, z = -6.783 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1, room = 1 },
	{ config_id = 1003, gadget_id = 70360089, pos = { x = -7.641, y = 1.767, z = -0.821 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1, room = 1 }
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
		gadgets = { },
		regions = { },
		triggers = { },
		rand_weight = 100
	},
	{
		-- suite_id = 2,
		-- description = ,
		monsters = { },
		gadgets = { 1001, 1002, 1003 },
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