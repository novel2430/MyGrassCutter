-- 基础信息
local base_info = {
	group_id = 133303409
}

--================================================================
-- 
-- 配置
-- 
--================================================================

-- 怪物
monsters = {
	{ config_id = 409001, monster_id = 28060201, pos = { x = -1066.311, y = 180.141, z = 3722.884 }, rot = { x = 0.000, y = 174.248, z = 0.000 }, level = 30, drop_tag = "走兽", disableWander = true, pose_id = 4, area_id = 23 },
	{ config_id = 409002, monster_id = 28060201, pos = { x = -1057.825, y = 186.683, z = 3742.155 }, rot = { x = 0.000, y = 181.734, z = 0.000 }, level = 30, drop_tag = "走兽", pose_id = 3, area_id = 23 }
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
		monsters = { 409001, 409002 },
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
	}
}

--================================================================
-- 
-- 触发器
-- 
--================================================================