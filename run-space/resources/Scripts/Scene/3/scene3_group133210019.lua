-- 基础信息
local base_info = {
	group_id = 133210019
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
	{ config_id = 19001, gadget_id = 70330064, pos = { x = -3841.626, y = 201.747, z = -1211.660 }, rot = { x = 358.822, y = 57.344, z = 356.507 }, level = 30, interact_id = 35, area_id = 17 }
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
		{ config_id = 19002, gadget_id = 70290101, pos = { x = -3861.715, y = 202.145, z = -1196.359 }, rot = { x = 0.598, y = 196.818, z = 1.116 }, level = 30, state = GadgetState.GearStart, area_id = 17 },
		{ config_id = 19003, gadget_id = 70290101, pos = { x = -3775.988, y = 200.076, z = -1234.070 }, rot = { x = 1.683, y = 263.814, z = 358.918 }, level = 30, state = GadgetState.GearStart, area_id = 17 }
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
		gadgets = { 19001 },
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