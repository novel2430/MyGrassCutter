-- 基础信息
local base_info = {
	group_id = 133209071
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
	-- 同人摊摊主
	{ config_id = 71001, npc_id = 30065, pos = { x = -2571.454, y = 214.213, z = -3842.481 }, rot = { x = 0.000, y = 177.697, z = 0.000 }, area_id = 11 },
	{ config_id = 71002, npc_id = 30166, pos = { x = -2548.286, y = 217.549, z = -3840.742 }, rot = { x = 0.000, y = 218.088, z = 0.000 }, area_id = 11 },
	{ config_id = 71003, npc_id = 30165, pos = { x = -2549.079, y = 217.549, z = -3841.562 }, rot = { x = 0.000, y = 25.991, z = 0.000 }, area_id = 11 },
	-- 勘定奉行役人
	{ config_id = 71004, npc_id = 30164, pos = { x = -2570.906, y = 214.213, z = -3852.820 }, rot = { x = 0.000, y = 350.961, z = 0.000 }, area_id = 11 },
	-- 同人摊摊主
	{ config_id = 71005, npc_id = 20568, pos = { x = -2575.235, y = 214.213, z = -3853.770 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, area_id = 11 },
	-- 「八重堂」编辑
	{ config_id = 71006, npc_id = 20562, pos = { x = -2584.188, y = 214.213, z = -3847.646 }, rot = { x = 0.000, y = 110.394, z = 0.000 }, area_id = 11 },
	-- 「八重堂」编辑
	{ config_id = 71007, npc_id = 30139, pos = { x = -2594.120, y = 217.656, z = -3834.778 }, rot = { x = 0.000, y = 217.440, z = 0.000 }, area_id = 11 },
	-- 「八重堂」编辑
	{ config_id = 71008, npc_id = 3190, pos = { x = -2598.961, y = 217.736, z = -3847.563 }, rot = { x = 0.000, y = 21.849, z = 0.000 }, area_id = 11 },
	{ config_id = 71009, npc_id = 30163, pos = { x = -2582.945, y = 211.130, z = -3790.516 }, rot = { x = 0.000, y = 117.199, z = 0.000 }, area_id = 11 },
	{ config_id = 71011, npc_id = 30174, pos = { x = -2581.061, y = 214.213, z = -3852.204 }, rot = { x = 0.000, y = 20.000, z = 0.000 }, area_id = 11 },
	{ config_id = 71012, npc_id = 30176, pos = { x = -2569.663, y = 212.478, z = -3800.817 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, area_id = 11 },
	{ config_id = 71013, npc_id = 30177, pos = { x = -2572.015, y = 212.478, z = -3798.347 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, area_id = 11 },
	{ config_id = 71014, npc_id = 30178, pos = { x = -2575.501, y = 212.478, z = -3797.885 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, area_id = 11 },
	{ config_id = 71015, npc_id = 30179, pos = { x = -2577.772, y = 212.478, z = -3800.756 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, area_id = 11 },
	{ config_id = 71016, npc_id = 30180, pos = { x = -2577.748, y = 212.478, z = -3804.219 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, area_id = 11 }
}

-- 装置
gadgets = {
	{ config_id = 71010, gadget_id = 70710443, pos = { x = -2581.061, y = 214.213, z = -3852.204 }, rot = { x = 0.000, y = 20.000, z = 0.000 }, level = 1, area_id = 11 }
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
		gadgets = { 71010 },
		regions = { },
		triggers = { },
		npcs = { 71001, 71002, 71003, 71004, 71005, 71006, 71007, 71008, 71009, 71011, 71012, 71013, 71014, 71015, 71016 },
		rand_weight = 100
	}
}

--================================================================
-- 
-- 触发器
-- 
--================================================================