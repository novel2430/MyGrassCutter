-- 基础信息
local base_info = {
	group_id = 133302008
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
	gadgets = {
		{ config_id = 8002, gadget_id = 70200013, pos = { x = -528.682, y = 221.980, z = 2332.357 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 27, area_id = 24 }
	},
	regions = {
		{ config_id = 8001, shape = RegionShape.POLYGON, pos = { x = -531.616, y = 229.608, z = 2349.295 }, height = 133.574, point_array = { { x = -593.862, y = 2440.344 }, { x = -640.277, y = 2425.468 }, { x = -658.928, y = 2392.979 }, { x = -659.481, y = 2332.279 }, { x = -600.394, y = 2313.876 }, { x = -546.902, y = 2280.001 }, { x = -475.262, y = 2258.247 }, { x = -403.751, y = 2305.883 }, { x = -421.993, y = 2354.047 } }, area_id = 24, vision_type_list = { 33020002 } }
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
	}
}

--================================================================
-- 
-- 触发器
-- 
--================================================================