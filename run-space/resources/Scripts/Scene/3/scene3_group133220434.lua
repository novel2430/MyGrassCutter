-- 基础信息
local base_info = {
	group_id = 133220434
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
	monsters = {
		{ config_id = 434001, monster_id = 20010601, pos = { x = -2566.289, y = 412.941, z = -4440.213 }, rot = { x = 0.000, y = 265.541, z = 0.000 }, level = 27, drop_tag = "大史莱姆", area_id = 11 }
	},
	regions = {
		{ config_id = 434004, shape = RegionShape.SPHERE, radius = 5, pos = { x = -2566.444, y = 412.919, z = -4439.372 }, area_id = 11 }
	},
	triggers = {
		{ config_id = 1434004, name = "ENTER_REGION_434004", event = EventType.EVENT_ENTER_REGION, source = "", condition = "condition_EVENT_ENTER_REGION_434004", action = "action_EVENT_ENTER_REGION_434004" }
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
	}
}

--================================================================
-- 
-- 触发器
-- 
--================================================================