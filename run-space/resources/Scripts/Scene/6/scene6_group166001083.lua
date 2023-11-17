-- 基础信息
local base_info = {
	group_id = 166001083
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

-- 废弃数据
garbages = {
	npcs = {
		{ config_id = 83001, npc_id = 2154, pos = { x = 1090.305, y = 962.278, z = 673.035 }, rot = { x = 0.000, y = 322.543, z = 0.000 }, area_id = 300 },
		{ config_id = 83002, npc_id = 2154, pos = { x = 174.139, y = 457.971, z = 618.006 }, rot = { x = 0.000, y = 176.593, z = 0.000 }, area_id = 300 }
	},
	gadgets = {
		{ config_id = 83003, gadget_id = 70360001, pos = { x = 449.575, y = 378.300, z = 522.542 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 32, area_id = 300 },
		{ config_id = 83004, gadget_id = 70360001, pos = { x = 757.309, y = 767.329, z = 277.034 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 32, area_id = 300 }
	}
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
		rand_weight = 100
	},
	{
		-- suite_id = 3,
		-- description = ,
		monsters = { },
		gadgets = { },
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