/* tslint:disable:no-unused-variable */

import { TestBed, async, inject } from '@angular/core/testing';
import { StockviewService } from './stockview.service';

describe('Service: Stockview', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [StockviewService]
    });
  });

  it('should ...', inject([StockviewService], (service: StockviewService) => {
    expect(service).toBeTruthy();
  }));
});
