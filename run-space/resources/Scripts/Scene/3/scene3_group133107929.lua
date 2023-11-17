-- 基础信息
local base_info = {
	group_id = 133107929
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
	{ config_id = 929001, npc_id = 10329, pos = { x = -360.780, y = 209.119, z = 329.197 }, rot = { x = 0.000, y = 197.040, z = 0.000 }, area_id = 7 },
	{ config_id = 929002, npc_id = 10330, pos = { x = -352.394, y = 209.119, z = 337.449 }, rot = { x = 0.000, y = 306.930, z = 0.000 }, area_id = 7 },
	{ config_id = 929003, npc_id = 10331, pos = { x = -360.337, y = 209.106, z = 353.984 }, rot = { x = 0.000, y = 306.930, z = 0.000 }, area_id = 7 }
}

-- 装置
gadgets = {
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
		gadgets = { },
		regions = { },
		triggers = { },
		npcs = { 929001, 929002, 929003 },
		rand_weight = 100
	}
}

--================================================================
-- 
-- 触发器
-- 
--================================================================