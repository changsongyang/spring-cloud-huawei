/*

 * Copyright (C) 2020-2022 Huawei Technologies Co., Ltd. All rights reserved.

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

package com.huaweicloud.samples;

import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import com.huaweicloud.common.adapters.gateway.PreGlobalFilter;
import com.huaweicloud.common.context.InvocationContextHolder;

@Component
public class AddTestHeaderPreGlobalFilter implements PreGlobalFilter {
  @Override
  public void process(ServerWebExchange exchange) {
    InvocationContextHolder.getOrCreateInvocationContext().putContext("test03", "test03");
  }

  @Override
  public int getOrder() {
    return 0;
  }
}
