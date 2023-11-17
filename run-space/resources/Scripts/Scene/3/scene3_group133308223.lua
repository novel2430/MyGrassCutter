-- 基础信息
local base_info = {
	group_id = 133308223
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
	{ config_id = 223001, gadget_id = 70500000, pos = { x = -1698.757, y = 294.275, z = 4332.849 }, rot = { x = 332.637, y = 234.786, z = 358.940 }, level = 32, point_type = 1001, area_id = 26 },
	{ config_id = 223002, gadget_id = 70500000, pos = { x = -1705.525, y = 301.273, z = 4323.004 }, rot = { x = 331.953, y = 273.247, z = 346.837 }, level = 32, point_type = 1001, area_id = 26 },
	{ config_id = 223003, gadget_id = 70500000, pos = { x = -1700.612, y = 294.086, z = 4334.766 }, rot = { x = 352.564, y = 263.166, z = 327.001 }, level = 32, point_type = 1001, area_id = 26 },
	{ config_id = 223004, gadget_id = 70500000, pos = { x = -1704.752, y = 300.924, z = 4322.203 }, rot = { x = 11.083, y = 152.166, z = 32.080 }, level = 32, point_type = 1002, area_id = 26 },
	{ config_id = 223005, gadget_id = 70500000, pos = { x = -1699.868, y = 294.227, z = 4334.129 }, rot = { x = 13.014, y = 105.189, z = 25.291 }, level = 32, point_type = 1002, area_id = 26 },
	{ config_id = 223006, gadget_id = 70500000, pos = { x = -1676.996, y = 285.882, z = 4338.468 }, rot = { x = 344.365, y = 6.869, z = 352.085 }, level = 32, point_type = 2053, area_id = 26 },
	{ config_id = 223007, gadget_id = 70500000, pos = { x = -1703.743, y = 300.467, z = 4321.548 }, rot = { x = 32.701, y = 93.991, z = 20.827 }, level = 32, point_type = 1002, area_id = 26 },
	{ config_id = 223008, gadget_id = 70500000, pos = { x = -1696.841, y = 273.054, z = 4385.013 }, rot = { x = 37.913, y = 23.468, z = 335.759 }, level = 32, point_type = 2053, area_id = 26 }
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
		gadgets = { 223001, 223002, 223003, 223004, 223005, 223006, 223007, 223008 },
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