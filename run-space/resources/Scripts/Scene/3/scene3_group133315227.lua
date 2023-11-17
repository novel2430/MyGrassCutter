-- 基础信息
local base_info = {
	group_id = 133315227
}

-- Trigger变量
local defs = {
	gadget_VP = 227001,
	pointarray_id = 331500004,
	minPoint = 1,
	maxPoint = 3
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
	{ config_id = 227001, gadget_id = 70330200, pos = { x = 468.383, y = 222.293, z = 2214.534 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 27, is_use_point_array = true, area_id = 20 }
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
		gadgets = { 227001 },
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

require "V3_0/VisualizationPlantOne"