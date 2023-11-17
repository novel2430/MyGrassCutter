-- 基础信息
local base_info = {
	group_id = 133302485
}

--================================================================
-- 
-- 配置
-- 
--================================================================

-- 怪物
monsters = {
	{ config_id = 485001, monster_id = 26090101, pos = { x = -661.309, y = 132.000, z = 2651.650 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 27, drop_tag = "蕈兽", pose_id = 102, area_id = 24 },
	{ config_id = 485002, monster_id = 26090101, pos = { x = -669.597, y = 132.000, z = 2660.846 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 27, drop_tag = "蕈兽", pose_id = 101, area_id = 24 },
	{ config_id = 485003, monster_id = 26090101, pos = { x = -655.388, y = 132.000, z = 2662.958 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 27, drop_tag = "蕈兽", pose_id = 102, area_id = 24 },
	{ config_id = 485004, monster_id = 26120301, pos = { x = -665.070, y = 132.000, z = 2647.297 }, rot = { x = 0.000, y = 209.904, z = 0.000 }, level = 27, drop_tag = "大蕈兽", pose_id = 101, area_id = 24 }
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
		monsters = { 485001, 485002, 485003, 485004 },
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