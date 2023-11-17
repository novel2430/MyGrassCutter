-- 基础信息
local base_info = {
	group_id = 133104336
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
	{ config_id = 336001, gadget_id = 70220013, pos = { x = 318.452, y = 217.914, z = 142.471 }, rot = { x = 356.417, y = 216.732, z = 357.330 }, level = 19, area_id = 9 },
	{ config_id = 336002, gadget_id = 70220013, pos = { x = 320.104, y = 217.816, z = 143.997 }, rot = { x = 9.561, y = 251.744, z = 352.260 }, level = 19, area_id = 9 },
	{ config_id = 336003, gadget_id = 70220014, pos = { x = 317.630, y = 217.709, z = 144.322 }, rot = { x = 8.409, y = 215.854, z = 352.977 }, level = 19, area_id = 9 },
	{ config_id = 336004, gadget_id = 70220014, pos = { x = 311.082, y = 224.687, z = 141.081 }, rot = { x = 0.000, y = 217.108, z = 0.000 }, level = 19, area_id = 9 },
	{ config_id = 336005, gadget_id = 70220014, pos = { x = 311.322, y = 224.687, z = 143.014 }, rot = { x = 0.000, y = 217.027, z = 0.000 }, level = 19, area_id = 9 }
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
		gadgets = { 336001, 336002, 336003, 336004, 336005 },
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