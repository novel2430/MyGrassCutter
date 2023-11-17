-- 基础信息
local base_info = {
	group_id = 133314246
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
	{ config_id = 246001, gadget_id = 70290624, pos = { x = -882.464, y = 58.379, z = 4670.899 }, rot = { x = 353.591, y = 245.634, z = 17.423 }, level = 32, area_id = 32 },
	{ config_id = 246002, gadget_id = 70290624, pos = { x = -937.555, y = 49.368, z = 4694.015 }, rot = { x = 0.000, y = 198.511, z = 16.597 }, level = 32, area_id = 32 },
	{ config_id = 246003, gadget_id = 70290624, pos = { x = -921.907, y = 55.483, z = 4716.056 }, rot = { x = -0.002, y = 147.921, z = 11.568 }, level = 32, area_id = 32 }
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
		gadgets = { 246001, 246002, 246003 },
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