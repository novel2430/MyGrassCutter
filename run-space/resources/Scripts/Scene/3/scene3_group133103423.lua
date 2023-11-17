-- 基础信息
local base_info = {
	group_id = 133103423
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
	{ config_id = 423001, gadget_id = 70220013, pos = { x = 56.057, y = 194.094, z = 1253.361 }, rot = { x = 20.700, y = 43.000, z = 3.840 }, level = 24, area_id = 6 },
	{ config_id = 423002, gadget_id = 70220013, pos = { x = 53.755, y = 194.219, z = 1254.261 }, rot = { x = 19.990, y = 20.000, z = 0.000 }, level = 24, area_id = 6 },
	{ config_id = 423003, gadget_id = 70220013, pos = { x = 68.282, y = 189.827, z = 1263.199 }, rot = { x = 343.750, y = 145.000, z = 9.100 }, level = 24, area_id = 6 },
	{ config_id = 423004, gadget_id = 70220013, pos = { x = 67.563, y = 189.280, z = 1265.838 }, rot = { x = 4.770, y = 0.000, z = 356.700 }, level = 24, area_id = 6 },
	{ config_id = 423005, gadget_id = 70220014, pos = { x = 55.188, y = 191.255, z = 1271.818 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 24, area_id = 6 },
	{ config_id = 423006, gadget_id = 70220014, pos = { x = 56.440, y = 191.058, z = 1272.536 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 24, area_id = 6 },
	{ config_id = 423007, gadget_id = 70220014, pos = { x = 56.526, y = 190.985, z = 1271.146 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 24, area_id = 6 },
	{ config_id = 423008, gadget_id = 70220013, pos = { x = 38.944, y = 196.226, z = 1273.344 }, rot = { x = 5.246, y = 358.904, z = 349.062 }, level = 24, area_id = 6 },
	{ config_id = 423009, gadget_id = 70220013, pos = { x = 35.436, y = 197.498, z = 1274.784 }, rot = { x = 0.162, y = 359.291, z = 357.327 }, level = 24, area_id = 6 }
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
		gadgets = { 423001, 423002, 423003, 423004, 423005, 423006, 423007, 423008, 423009 },
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