/*
 * Copyright 2020 ZUP IT SERVICOS EM TECNOLOGIA E INOVACAO SA
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

package br.com.zup.beagle.networking.urlbuilder

internal class UrlBuilderDefault : UrlBuilder {

    override fun format(endpoint: String, path: String): String {
        if (isRelativePath(path)) {
            return endpoint + path
        } else {
            return path
        }
    }

    private fun isRelativePath(path: String): Boolean {
        return path.startsWith("/")
    }
}