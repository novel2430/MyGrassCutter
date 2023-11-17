-- 基础信息
local base_info = {
	group_id = 245003037
}

-- Trigger变量
local defs = {
	group_id = 245003037,
	challange_group_id = 245003031,
	monster_points = 1,
	max_points = 100,
	gear_list = {70350107,70350099,70350100,70350101,70350102,70350103},
	option_list = {41,42,43,44,45},
	option_points = {20,20,20,20,20},
	fundation_id = 70350145
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
	{ config_id = 37001, gadget_id = 70350145, pos = { x = -17.289, y = -0.349, z = -75.385 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 },
	{ config_id = 37002, gadget_id = 70350145, pos = { x = -17.271, y = -0.347, z = -68.320 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 },
	{ config_id = 37003, gadget_id = 70350145, pos = { x = -17.406, y = -0.350, z = -61.549 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 },
	{ config_id = 37004, gadget_id = 70350145, pos = { x = 9.253, y = -4.156, z = -71.793 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 },
	{ config_id = 37005, gadget_id = 70350145, pos = { x = 9.122, y = -4.157, z = -64.103 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 },
	{ config_id = 37006, gadget_id = 70350145, pos = { x = 15.910, y = -4.150, z = -71.592 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 },
	{ config_id = 37007, gadget_id = 70350145, pos = { x = 15.803, y = -4.160, z = -64.187 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 },
	{ config_id = 37008, gadget_id = 70350145, pos = { x = 23.488, y = -4.150, z = -84.961 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 },
	{ config_id = 37009, gadget_id = 70350145, pos = { x = 30.236, y = -4.150, z = -84.997 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 },
	{ config_id = 37010, gadget_id = 70350145, pos = { x = 23.509, y = -4.147, z = -50.325 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 },
	{ config_id = 37011, gadget_id = 70350145, pos = { x = 29.730, y = -4.141, z = -50.249 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 },
	{ config_id = 37012, gadget_id = 70350145, pos = { x = 26.872, y = -4.147, z = -81.678 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 },
	{ config_id = 37013, gadget_id = 70350145, pos = { x = 20.815, y = -4.150, z = -81.816 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 },
	{ config_id = 37014, gadget_id = 70350145, pos = { x = 32.893, y = -4.150, z = -81.545 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 },
	{ config_id = 37015, gadget_id = 70350145, pos = { x = 26.624, y = -4.147, z = -53.710 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 },
	{ config_id = 37016, gadget_id = 70350145, pos = { x = 20.378, y = -4.150, z = -53.547 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 },
	{ config_id = 37017, gadget_id = 70350145, pos = { x = 38.227, y = -4.135, z = -72.515 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 },
	{ config_id = 37018, gadget_id = 70350145, pos = { x = 38.441, y = -4.162, z = -64.259 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 },
	{ config_id = 37019, gadget_id = 70350145, pos = { x = 42.838, y = -4.161, z = -68.651 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 },
	{ config_id = 37020, gadget_id = 70350145, pos = { x = 32.905, y = -4.157, z = -53.743 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 },
	{ config_id = 37021, gadget_id = 70350145, pos = { x = 29.853, y = -4.139, z = -57.271 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 },
	{ config_id = 37022, gadget_id = 70350145, pos = { x = 23.445, y = -4.143, z = -57.208 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 },
	{ config_id = 37023, gadget_id = 70350145, pos = { x = 12.446, y = -4.143, z = -67.938 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 },
	{ config_id = 37024, gadget_id = 70350145, pos = { x = 23.548, y = -4.138, z = -78.346 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 },
	{ config_id = 37025, gadget_id = 70350145, pos = { x = 30.255, y = -4.150, z = -78.194 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 },
	{ config_id = 37051, gadget_id = 70350145, pos = { x = 12.715, y = -4.150, z = -78.190 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 },
	{ config_id = 37052, gadget_id = 70350145, pos = { x = 12.680, y = -4.150, z = -57.513 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 },
	{ config_id = 37053, gadget_id = 70350145, pos = { x = 15.271, y = -4.150, z = -53.537 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 },
	{ config_id = 37054, gadget_id = 70350145, pos = { x = 15.170, y = -4.150, z = -82.050 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 },
	{ config_id = 37055, gadget_id = 70350145, pos = { x = 5.847, y = -4.158, z = -68.010 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1 }
}

-- 区域
regions = {
}

-- 触发器
triggers = {
}

-- 点位
points = {
	{ config_id = 37026, pos = { x = -17.289, y = -0.349, z = -75.385 }, rot = { x = 0.000, y = 180.000, z = 0.000 } },
	{ config_id = 37027, pos = { x = -17.271, y = -0.347, z = -68.320 }, rot = { x = 0.000, y = 90.000, z = 0.000 } },
	{ config_id = 37028, pos = { x = -17.406, y = -0.350, z = -61.549 }, rot = { x = 0.000, y = 0.000, z = 0.000 } },
	{ config_id = 37029, pos = { x = 9.253, y = -4.156, z = -71.793 }, rot = { x = 0.000, y = 270.000, z = 0.000 } },
	{ config_id = 37030, pos = { x = 9.122, y = -4.157, z = -64.103 }, rot = { x = 0.000, y = 270.000, z = 0.000 } },
	{ config_id = 37031, pos = { x = 15.910, y = -4.150, z = -71.592 }, rot = { x = 0.000, y = 270.000, z = 0.000 } },
	{ config_id = 37032, pos = { x = 15.803, y = -4.160, z = -64.187 }, rot = { x = 0.000, y = 270.000, z = 0.000 } },
	{ config_id = 37033, pos = { x = 23.488, y = -4.150, z = -84.961 }, rot = { x = 0.000, y = 270.000, z = 0.000 } },
	{ config_id = 37034, pos = { x = 30.236, y = -4.150, z = -84.997 }, rot = { x = 0.000, y = 270.000, z = 0.000 } },
	{ config_id = 37035, pos = { x = 23.509, y = -4.147, z = -50.325 }, rot = { x = 0.000, y = 270.000, z = 0.000 } },
	{ config_id = 37036, pos = { x = 29.730, y = -4.141, z = -50.249 }, rot = { x = 0.000, y = 270.000, z = 0.000 } },
	{ config_id = 37037, pos = { x = 26.872, y = -4.147, z = -81.678 }, rot = { x = 0.000, y = 270.000, z = 0.000 } },
	{ config_id = 37038, pos = { x = 20.815, y = -4.150, z = -81.816 }, rot = { x = 0.000, y = 270.000, z = 0.000 } },
	{ config_id = 37039, pos = { x = 32.893, y = -4.150, z = -81.545 }, rot = { x = 0.000, y = 270.000, z = 0.000 } },
	{ config_id = 37040, pos = { x = 26.624, y = -4.147, z = -53.710 }, rot = { x = 0.000, y = 270.000, z = 0.000 } },
	{ config_id = 37041, pos = { x = 20.378, y = -4.150, z = -53.547 }, rot = { x = 0.000, y = 270.000, z = 0.000 } },
	{ config_id = 37042, pos = { x = 38.227, y = -4.135, z = -72.515 }, rot = { x = 0.000, y = 180.000, z = 0.000 } },
	{ config_id = 37043, pos = { x = 38.441, y = -4.162, z = -64.259 }, rot = { x = 0.000, y = 0.000, z = 0.000 } },
	{ config_id = 37044, pos = { x = 42.838, y = -4.161, z = -68.651 }, rot = { x = 0.000, y = 270.000, z = 0.000 } },
	{ config_id = 37045, pos = { x = 32.905, y = -4.157, z = -53.743 }, rot = { x = 0.000, y = 270.000, z = 0.000 } },
	{ config_id = 37046, pos = { x = 29.853, y = -4.139, z = -57.271 }, rot = { x = 0.000, y = 270.000, z = 0.000 } },
	{ config_id = 37047, pos = { x = 23.445, y = -4.143, z = -57.208 }, rot = { x = 0.000, y = 270.000, z = 0.000 } },
	{ config_id = 37048, pos = { x = 12.446, y = -4.143, z = -67.938 }, rot = { x = 0.000, y = 270.000, z = 0.000 } },
	{ config_id = 37049, pos = { x = 23.548, y = -4.138, z = -78.346 }, rot = { x = 0.000, y = 270.000, z = 0.000 } },
	{ config_id = 37050, pos = { x = 30.255, y = -4.150, z = -78.194 }, rot = { x = 0.000, y = 270.000, z = 0.000 } },
	{ config_id = 37056, pos = { x = 12.715, y = -4.150, z = -78.190 }, rot = { x = 0.000, y = 270.000, z = 0.000 } },
	{ config_id = 37057, pos = { x = 12.680, y = -4.150, z = -57.513 }, rot = { x = 0.000, y = 270.000, z = 0.000 } },
	{ config_id = 37058, pos = { x = 15.271, y = -4.150, z = -53.537 }, rot = { x = 0.000, y = 270.000, z = 0.000 } },
	{ config_id = 37059, pos = { x = 15.170, y = -4.150, z = -82.050 }, rot = { x = 0.000, y = 270.000, z = 0.000 } },
	{ config_id = 37060, pos = { x = 5.847, y = -4.158, z = -68.010 }, rot = { x = 0.000, y = 270.000, z = 0.000 } }
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

require "V2_0/TowerDefense_Gear_V2.0"