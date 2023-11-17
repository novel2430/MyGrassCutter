-- 基础信息
local base_info = {
	group_id = 133309249
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
	{ config_id = 249002, gadget_id = 70220103, pos = { x = -2119.499, y = 125.785, z = 5956.917 }, rot = { x = 0.000, y = 309.929, z = 0.000 }, level = 32, area_id = 27 },
	{ config_id = 249003, gadget_id = 70220103, pos = { x = -2086.491, y = 140.072, z = 5979.884 }, rot = { x = 0.000, y = 309.929, z = 0.000 }, level = 32, area_id = 27 },
	{ config_id = 249004, gadget_id = 70220103, pos = { x = -2069.820, y = 146.281, z = 5953.274 }, rot = { x = 0.000, y = 309.929, z = 0.000 }, level = 32, area_id = 27 },
	{ config_id = 249005, gadget_id = 70220103, pos = { x = -2100.247, y = 135.527, z = 5940.843 }, rot = { x = 0.000, y = 123.872, z = 0.000 }, level = 32, area_id = 27 },
	{ config_id = 249007, gadget_id = 70220103, pos = { x = -2068.304, y = 125.422, z = 5967.226 }, rot = { x = 0.000, y = 0.000, z = 0.000 }, level = 32, area_id = 27 },
	{ config_id = 249009, gadget_id = 70220103, pos = { x = -2103.877, y = 131.506, z = 5968.970 }, rot = { x = 0.000, y = 309.929, z = 0.000 }, level = 32, area_id = 27 }
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
		gadgets = { 249002, 249003, 249004, 249005, 249007, 249009 },
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