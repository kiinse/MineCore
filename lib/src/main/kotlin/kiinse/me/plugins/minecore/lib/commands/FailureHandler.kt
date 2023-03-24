// MIT License
//
// Copyright (c) 2022 kiinse
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in all
// copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NON INFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
// SOFTWARE.
package kiinse.me.plugins.minecore.lib.commands

import kiinse.me.plugins.minecore.api.MineCorePlugin
import kiinse.me.plugins.minecore.api.commands.CommandFailReason
import kiinse.me.plugins.minecore.api.commands.CommandFailureHandler
import kiinse.me.plugins.minecore.api.commands.RegisteredCommand
import kiinse.me.plugins.minecore.api.files.messages.MessagesUtils
import org.bukkit.command.CommandSender

class FailureHandler(plugin: MineCorePlugin) : CommandFailureHandler {

    private val messagesUtils: MessagesUtils = plugin.mineCore.getMessagesUtils(plugin)

    override fun handleFailure(reason: CommandFailReason, sender: CommandSender, command: RegisteredCommand?) {
        messagesUtils.sendMessageWithPrefix(sender, reason)
    }
}