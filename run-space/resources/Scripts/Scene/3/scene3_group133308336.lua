-- 基础信息
local base_info = {
	group_id = 133308336
}

--================================================================
-- 
-- 配置
-- 
--================================================================

-- 怪物
monsters = {
	{ config_id = 336001, monster_id = 28060401, pos = { x = -1875.537, y = 383.710, z = 4264.844 }, rot = { x = 0.000, y = 181.919, z = 0.000 }, level = 32, drop_tag = "走兽", disableWander = true, pose_id = 1, area_id = 26 },
	{ config_id = 336003, monster_id = 28060401, pos = { x = -1905.744, y = 383.022, z = 4251.050 }, rot = { x = 0.000, y = 269.647, z = 0.000 }, level = 32, drop_tag = "走兽", disableWander = true, pose_id = 1, area_id = 26 },
	{ config_id = 336004, monster_id = 28060401, pos = { x = -1909.077, y = 383.249, z = 4256.324 }, rot = { x = 0.000, y = 208.277, z = 0.000 }, level = 32, drop_tag = "走兽", disableWander = true, pose_id = 1, area_id = 26 }
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
		monsters = { 336001, 336003, 336004 },
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