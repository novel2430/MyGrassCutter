-- 基础信息
local base_info = {
	group_id = 133001271
}

--================================================================
-- 
-- 配置
-- 
--================================================================

-- 怪物
monsters = {
	{ config_id = 1180, monster_id = 28030305, pos = { x = 2187.558, y = 207.883, z = -960.765 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1, drop_tag = "鸟类", area_id = 1 },
	{ config_id = 1182, monster_id = 28030303, pos = { x = 2188.892, y = 211.520, z = -1017.795 }, rot = { x = 0.000, y = 247.977, z = 0.000 }, level = 1, drop_tag = "鸟类", area_id = 1 },
	{ config_id = 1183, monster_id = 28030303, pos = { x = 2200.747, y = 211.815, z = -994.338 }, rot = { x = 0.000, y = 303.524, z = 0.000 }, level = 1, drop_tag = "鸟类", area_id = 1 },
	{ config_id = 1184, monster_id = 28030303, pos = { x = 2207.627, y = 211.499, z = -986.595 }, rot = { x = 0.000, y = 272.015, z = 0.000 }, level = 1, drop_tag = "鸟类", area_id = 1 },
	{ config_id = 1186, monster_id = 28030305, pos = { x = 2193.146, y = 211.749, z = -1013.243 }, rot = { x = 0.000, y = 299.906, z = 0.000 }, level = 1, drop_tag = "鸟类", area_id = 1 },
	{ config_id = 1188, monster_id = 28030305, pos = { x = 2190.375, y = 211.704, z = -1015.375 }, rot = { x = 0.000, y = 329.903, z = 0.000 }, level = 1, drop_tag = "鸟类", area_id = 1 },
	{ config_id = 1190, monster_id = 28030301, pos = { x = 2187.579, y = 209.314, z = -1054.649 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1, drop_tag = "鸟类", area_id = 1 },
	{ config_id = 1192, monster_id = 28030301, pos = { x = 2186.701, y = 209.403, z = -1053.785 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1, drop_tag = "鸟类", area_id = 1 },
	{ config_id = 1194, monster_id = 28030301, pos = { x = 2187.387, y = 209.227, z = -1056.246 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 1, drop_tag = "鸟类", area_id = 1 },
	{ config_id = 1216, monster_id = 28030301, pos = { x = 2190.508, y = 211.735, z = -1013.503 }, rot = { x = 0.000, y = 199.945, z = 0.000 }, level = 1, drop_tag = "鸟类", area_id = 1 },
	{ config_id = 1217, monster_id = 28030304, pos = { x = 2189.232, y = 211.761, z = -1013.645 }, rot = { x = 0.000, y = 82.827, z = 0.000 }, level = 1, drop_tag = "鸟类", area_id = 1 },
	{ config_id = 1218, monster_id = 28030301, pos = { x = 2189.881, y = 211.802, z = -1012.325 }, rot = { x = 0.000, y = 95.361, z = 0.000 }, level = 1, drop_tag = "鸟类", area_id = 1 },
	{ config_id = 1219, monster_id = 28030301, pos = { x = 2192.429, y = 211.844, z = -1015.404 }, rot = { x = 0.000, y = 21.592, z = 0.000 }, level = 1, drop_tag = "鸟类", area_id = 1 }
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
	rand_suite = true
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
		monsters = { 1180, 1182, 1183, 1184, 1186, 1188, 1190, 1192, 1194, 1216, 1217, 1218, 1219 },
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