/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

class CatJobsRecord {
  assignment_explanation: string
  'buckets.count': string
  'buckets.time.exp_avg': string
  'buckets.time.exp_avg_hour': string
  'buckets.time.max': string
  'buckets.time.min': string
  'buckets.time.total': string
  'data.buckets': string
  'data.earliest_record': string
  'data.empty_buckets': string
  'data.input_bytes': string
  'data.input_fields': string
  'data.input_records': string
  'data.invalid_dates': string
  'data.last': string
  'data.last_empty_bucket': string
  'data.last_sparse_bucket': string
  'data.latest_record': string
  'data.missing_fields': string
  'data.out_of_order_timestamps': string
  'data.processed_fields': string
  'data.processed_records': string
  'data.sparse_buckets': string
  'forecasts.memory.avg': string
  'forecasts.memory.min': string
  'forecasts.memory.total': string
  'forecasts.records.avg': string
  'forecasts.records.max': string
  'forecasts.records.min': string
  'forecasts.records.total': string
  'forecasts.time.avg': string
  'forecasts.time.max': string
  'forecasts.time.min': string
  'forecasts.total': string
  id: string
  'model.bucket_allocation_failures': string
  'model.by_fields': string
  'model.bytes': string
  'model.categorization_status': ModelCategorizationStatus
  'model.categorized_doc_count': string
  'model.dead_category_count': string
  'model.frequent_category_count': string
  'model.log_time': string
  'model.memory_limit': string
  'model.memory_status': ModelMemoryStatus
  'model.over_fields': string
  'model.partition_fields': string
  'model.rare_category_count': string
  'model.timestamp': string
  'node.address': string
  'node.ephemeral_id': string
  'node.id': string
  'node.name': string
  opened_time: string
  state: JobState
}
