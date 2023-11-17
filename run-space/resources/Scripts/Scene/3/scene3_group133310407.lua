-- 基础信息
local base_info = {
	group_id = 133310407
}

--================================================================
-- 
-- 配置
-- 
--================================================================

-- 怪物
monsters = {
	{ config_id = 407001, monster_id = 22040201, pos = { x = -2562.605, y = -14.408, z = 5617.609 }, rot = { x = 0.000, y = 162.030, z = 0.000 }, level = 32, drop_tag = "兽境幼兽", disableWander = true, pose_id = 101, area_id = 27 },
	{ config_id = 407002, monster_id = 22040201, pos = { x = -2569.121, y = -14.408, z = 5618.238 }, rot = { x = 0.000, y = 242.891, z = 0.000 }, level = 32, drop_tag = "兽境幼兽", disableWander = true, pose_id = 101, area_id = 27 }
}

-- NPC
npcs = {
}

-- 装置
gadgets = {
	{ config_id = 407003, gadget_id = 70330432, pos = { x = -2571.472, y = -14.396, z = 5617.004 }, rot = { x = 341.554, y = 88.142, z = 0.001 }, level = 32, area_id = 27 },
	{ config_id = 407005, gadget_id = 70330432, pos = { x = -2562.177, y = -14.408, z = 5615.180 }, rot = { x = 0.000, y = 351.618, z = 0.000 }, level = 32, area_id = 27 }
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
		monsters = { 407001, 407002 },
		gadgets = { 407003, 407005 },
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