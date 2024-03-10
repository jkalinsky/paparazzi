package com.paparazzi;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class PaparazziTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(PaparazziPlugin.class);
		RuneLite.main(args);
	}
}