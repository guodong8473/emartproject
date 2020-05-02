/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { ItemaddComponent } from './itemadd.component';

describe('ItemaddComponent', () => {
  let component: ItemaddComponent;
  let fixture: ComponentFixture<ItemaddComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ItemaddComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ItemaddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
