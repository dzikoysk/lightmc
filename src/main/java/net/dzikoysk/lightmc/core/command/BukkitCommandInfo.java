/*
 * Copyright (c) 2015-2018 Dzikoysk
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.dzikoysk.lightmc.core.command;

import org.bukkit.command.CommandSender;

public class BukkitCommandInfo {

    private final CommandSender commandSender;
    private final String[] arguments;

    public BukkitCommandInfo(CommandSender commandSender, String[] arguments) {
        this.commandSender = commandSender;
        this.arguments = arguments;
    }

    public String[] getArguments() {
        return arguments;
    }

    public CommandSender getCommandSender() {
        return commandSender;
    }

}
